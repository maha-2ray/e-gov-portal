package com.egov.egov_portal.service;

import com.egov.egov_portal.model.GovernmentService;
import com.egov.egov_portal.model.ServiceApplication;
import com.egov.egov_portal.repository.ServiceNotAvailableException;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class ApplicationService {

    private final ExecutorService executorService = Executors.newFixedThreadPool(5);

    public void submitApplication(ServiceApplication application){
        executorService.submit(() -> {
            GovernmentService service = application.getService();
            if (!service.isAvailable()) {
                throw new ServiceNotAvailableException("Service is currently unavailable");
            }
            application.setStatus("PROCESSING");

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ignored){

            }
            application.setStatus("APPROVED");
        });
    }
}
