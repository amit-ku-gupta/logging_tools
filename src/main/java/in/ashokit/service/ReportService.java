package in.ashokit.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	private Logger logger=LoggerFactory.getLogger(ReportService.class); 
	public void gaveReport() {
		logger.trace("this is trace msg");
		logger.debug("this is debug msg");
		logger.info("this is info msg");
		logger.warn("this is warn msg");
		logger.error("this is error msg");
		
		
	}
}
