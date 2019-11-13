package shine.designPattern.designPattern.creational.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class InterviewFactory {
	
    final static Map<String, Supplier<Interview>> factoryObjects = new HashMap<>();

	static {
			factoryObjects.put("JAVAINTERVIEW", JavaInterview::new);
			factoryObjects.put("PYTHONINTERVIEW", PythonInterview::new);
	}
	
	public Interview getInterview(String type) {

		Supplier<Interview> interwiewType = factoryObjects.get(type);
		return interwiewType.get();
		
	}

}
