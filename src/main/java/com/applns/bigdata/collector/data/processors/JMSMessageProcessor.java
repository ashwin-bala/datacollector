package com.applns.bigdata.collector.data.processors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.applns.bigdata.collector.data.DataCollectorApplication;
import com.applns.bigdata.collector.data.DataCollectorService;

import jakarta.jms.JMSException;

@Service
public class JMSMessageProcessor {
	
	private static final Logger log = LoggerFactory.getLogger(JMSMessageProcessor.class);

	@Autowired
	private DataCollectorService dataCollectorService;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${sqs.queueName}")
    private String queueName;
    
    
    @JmsListener(destination = "MessageQueue.fifo")
    public void createThumbnail(String requestJSON) throws JMSException {
        try {
        	log.info("Payload from the SQS Queue: ",requestJSON);
        	log.info("Calling Data Collector Service: ");
        	dataCollectorService.fetchDataFromApi();
        } catch (Exception ex) {
            throw new JMSException("Encountered error while parsing message.");
        }
    }
    

}
