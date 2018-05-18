import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import jaxb.Customer;
import jaxb.Customer.Address;

public class BeanUtils {
	/**  
     * 将一个 Map 对象转化为一个 JavaBean  
     * @param clazz 要转化的类型  
     * @param map 包含属性值的 map  
     * @return 转化出来的 JavaBean 对象  
     * @throws IntrospectionException 如果分析类属性失败  
     * @throws IllegalAccessException 如果实例化 JavaBean 失败  
     * @throws InstantiationException 如果实例化 JavaBean 失败  
     * @throws InvocationTargetException 如果调用属性的 setter 方法失败  
     */    
    @SuppressWarnings("rawtypes")    
    public static <T> T toBean(Class<T> clazz, Map<String,Object> map) {    
    	Object obj = null;
		try {
			obj = clazz.newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    
         if(map != null && map.size() > 0) {    
             for(Map.Entry<String, Object> entry : map.entrySet()) {    
                 String propertyName = entry.getKey();       //属性名  
                 Object value = entry.getValue();    
                 String setMethodName = "set"    
                         + propertyName.substring(0, 1).toUpperCase()  
                         + propertyName.substring(1);    
                 Field field = getClassField(clazz, propertyName);    
                 if(field==null)  
                     continue;  
                 Class<?> fieldTypeClass = field.getType();    
                 value = convertValType(value, fieldTypeClass);   
                 try{  
                	 if(value instanceof Map) {
                		 clazz.getMethod(setMethodName, field.getType()).invoke(obj, value);   
                	 }
                     clazz.getMethod(setMethodName, field.getType()).invoke(obj, value);   
                 }catch(NoSuchMethodException e){  
                     e.printStackTrace();  
                 } catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
             }    
         }    
         return (T)obj;    
    }    
    
    /**  
     * 将一个 JavaBean 对象转化为一个 Map  
     * @param bean 要转化的JavaBean 对象  
     * @return 转化出来的 Map 对象  
     * @throws IntrospectionException 如果分析类属性失败  
     * @throws IllegalAccessException 如果实例化 JavaBean 失败  
     * @throws InvocationTargetException 如果调用属性的 setter 方法失败  
     */    
    @SuppressWarnings("rawtypes")    
    public static Map objectToMap(Object obj) {    
    	try{
            Class type = obj.getClass();
            Map returnMap = new HashMap();
            BeanInfo beanInfo = Introspector.getBeanInfo(type);

            PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();
            for (int i = 0; i< propertyDescriptors.length; i++) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();
                if (!propertyName.equals("class")) {
                    Method readMethod = descriptor.getReadMethod();
                    Object result = readMethod.invoke(obj, new Object[0]);
                    if(result == null){
                        continue;
                    }
                    //判断是否为 基础类型 String,Boolean,Byte,Short,Integer,Long,Float,Double
                    //判断是否集合类，COLLECTION,MAP              
                    if(result instanceof String 
                            || result instanceof Boolean 
                            || result instanceof Byte 
                            || result instanceof Short 
                            || result instanceof Integer 
                            || result instanceof Long 
                            || result instanceof Float 
                            || result instanceof Double 
                            || result instanceof Enum 
                            ){
                        if (result != null) {
                            returnMap.put(propertyName, result);
                        }
                    }else if(result instanceof Collection){                        
                        Collection<?> lstObj = arrayToMap((Collection<?>)result);
                        returnMap.put(propertyName, lstObj);
                                
                    }else if(result instanceof Map){
                        Map<Object,Object> lstObj = mapToMap((Map<Object,Object>)result);
                        returnMap.put(propertyName, lstObj);
                    } else {
                        Map mapResult = objectToMap(result);
                        returnMap.put(propertyName, mapResult);
                    }
                    
                }
            }
            return returnMap;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }    
    
    private static Map<Object, Object> mapToMap(Map<Object, Object> orignMap) {
        Map<Object,Object> resultMap = new HashMap<Object,Object>();
        for(Entry<Object, Object> entry:orignMap.entrySet()){
            Object key = entry.getKey();
            Object resultKey = null;
            if(key instanceof Collection){
                resultKey = arrayToMap((Collection)key);
            }else if(key instanceof Map){
                resultKey = mapToMap((Map)key);
            }
            else{
                if(key instanceof String 
                        || key instanceof Boolean 
                        || key instanceof Byte 
                        || key instanceof Short 
                        || key instanceof Integer 
                        || key instanceof Long 
                        || key instanceof Float 
                        || key instanceof Double 
                        || key instanceof Enum 
                        ){
                    if (key != null) {
                        resultKey = key;
                    }
                }else{
                    resultKey = objectToMap(key);
                }                
            }
            

            Object value = entry.getValue();
            Object resultValue = null;
            if(value instanceof Collection){
                resultValue = arrayToMap((Collection)value);
            }else if(value instanceof Map){
                resultValue = mapToMap((Map)value);
            }
            else{
                if(value instanceof String 
                        || value instanceof Boolean 
                        || value instanceof Byte 
                        || value instanceof Short 
                        || value instanceof Integer 
                        || value instanceof Long 
                        || value instanceof Float 
                        || value instanceof Double 
                        || value instanceof Enum 
                        ){
                    if (value != null) {
                        resultValue = value;
                    }
                }else{
                    resultValue = objectToMap(value);
                }                
            }
            
            resultMap.put(resultKey, resultValue);
        }        
        return resultMap;
    }
    
    private static Collection arrayToMap(Collection lstObj){
        ArrayList arrayList = new ArrayList();
        
        for (Object t : lstObj) {
            if(t instanceof Collection){
                Collection result = arrayToMap((Collection)t);
                arrayList.add(result);
            }else if(t instanceof Map){
                Map result = mapToMap((Map)t);
                arrayList.add(result);
            } else {
                if(t instanceof String 
                        || t instanceof Boolean 
                        || t instanceof Byte 
                        || t instanceof Short 
                        || t instanceof Integer 
                        || t instanceof Long 
                        || t instanceof Float 
                        || t instanceof Double 
                        || t instanceof Enum 
                        ){
                    if (t != null) {
                        arrayList.add(t);
                    }
                }else{
                    Object result = objectToMap(t);
                    arrayList.add(result);    
                }                
            }
        }
        return arrayList;
    }
    
    /**  
     * 获取指定字段名称查找在class中的对应的Field对象(包括查找父类)  
     *   
     * @param clazz 指定的class  
     * @param fieldName 字段名称  
     * @return Field对象  
     */    
    private static Field getClassField(Class<?> clazz, String fieldName) {    
        if( Object.class.getName().equals(clazz.getName())) {    
            return null;    
        }    
        Field []declaredFields = clazz.getDeclaredFields();    
        for (Field field : declaredFields) {    
            if (field.getName().equals(fieldName)) {    
                return field;    
            }    
        }    
    
        Class<?> superClass = clazz.getSuperclass();    
        if(superClass != null) {// 简单的递归一下    
            return getClassField(superClass, fieldName);    
        }    
        return null;    
    }     
      
     /**  
     * 将Object类型的值，转换成bean对象属性里对应的类型值  
     *   
     * @param value Object对象值  
     * @param fieldTypeClass 属性的类型  
     * @return 转换后的值  
     */    
    private static Object convertValType(Object value, Class<?> fieldTypeClass) {    
        Object retVal = null;    
        if(Long.class.getName().equals(fieldTypeClass.getName())    
                || long.class.getName().equals(fieldTypeClass.getName())) {    
            retVal = Long.parseLong(value.toString());    
        } else if(Integer.class.getName().equals(fieldTypeClass.getName())    
                || int.class.getName().equals(fieldTypeClass.getName())) {    
            retVal = Integer.parseInt(value.toString());    
        } else if(Float.class.getName().equals(fieldTypeClass.getName())    
                || float.class.getName().equals(fieldTypeClass.getName())) {    
            retVal = Float.parseFloat(value.toString());    
        } else if(Double.class.getName().equals(fieldTypeClass.getName())    
                || double.class.getName().equals(fieldTypeClass.getName())) {    
            retVal = Double.parseDouble(value.toString());    
        } else {    
            retVal = value;    
        }    
        return retVal;    
    }    
    
    public static void main(String[] args) {    
       Customer customer = new Customer();
       customer.setName("张三");
       Address address = new Address();
       address.setCity("南宁市");
       address.setStreet("衡阳东路");
       customer.setAddress(address);
       Map<String,Object> map = objectToMap(customer);
       System.out.println(map);
       
       customer = toBean(Customer.class, map);
    }   
}
