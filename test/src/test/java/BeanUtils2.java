import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cglib.beans.BeanMap;

import jaxb.Customer;
import jaxb.Customer.Address;

public class BeanUtils2 {
	/**
	 *  * 将对象装换为map  * @param bean  * @return  
	 */
	public static <T> Map<String, Object> beanToMap(T bean) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (bean != null) {
			BeanMap beanMap = BeanMap.create(bean);
			for (Object key : beanMap.keySet()) {
				map.put(key + "", beanMap.get(key));
			}
		}
		return map;
	}

	/**
	 *  * 将map装换为javabean对象  * @param map  * @param bean  * @return  
	 */
	public static <T> T mapToBean(Map<String, Object> map, T bean) {
		BeanMap beanMap = BeanMap.create(bean);
		beanMap.putAll(map);
		return bean;
	}

	/**
	 *  * 将List<T>转换为List<Map<String, Object>>  * @param objList  * @return
	 *  * @throws JsonGenerationException  * @throws JsonMappingException
	 *  * @throws IOException  
	 */
	public static <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		if (objList != null && objList.size() > 0) {
			Map<String, Object> map = null;
			T bean = null;
			for (int i = 0, size = objList.size(); i < size; i++) {
				bean = objList.get(i);
				map = beanToMap(bean);
				list.add(map);
			}
		}
		return list;
	}

	/**
	 *  * 将List<Map<String,Object>>转换为List<T>  * @param maps  * @param clazz
	 *  * @return  * @throws InstantiationException  * @throws
	 * IllegalAccessException  
	 */
	public static <T> List<T> mapsToObjects(List<Map<String, Object>> maps, Class<T> clazz)
			throws InstantiationException, IllegalAccessException {
		List<T> list = new ArrayList<T>();
		if (maps != null && maps.size() > 0) {
			Map<String, Object> map = null;
			T bean = null;
			for (int i = 0, size = maps.size(); i < size; i++) {
				map = maps.get(i);
				bean = clazz.newInstance();
				mapToBean(map, bean);
				list.add(bean);
			}
		}
		return list;
	}
	
	 public static void main(String[] args) {    
//	       Customer customer = new Customer();
//	       customer.setName("张三");
//	       Address address = new Address();
//	       address.setCity("南宁市");
//	       address.setStreet("衡阳东路");
//	       customer.setAddress(address);
//	       Map<String,Object> map = beanToMap(customer);
//	       System.out.println(map);
//	       
//	       
//	       Address add = (Address)map.get("address");
//	       System.out.println(add.getStreet());
//	       customer = toBean(Customer.class, map);
	       
	       try {
			System.out.println(Class.forName("jaxb.Customer"));
//			Class.forName("jaxb.Customer").newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }   
}