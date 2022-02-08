package kz.iitu.itse1902.muhamedi.service;

import kz.iitu.itse1902.muhamedi.database.peripherals.Monitor;
import kz.iitu.itse1902.muhamedi.repository.KeyboardRepositoryImpl;
import kz.iitu.itse1902.muhamedi.repository.MonitorRepositoryImpl;
import kz.iitu.itse1902.muhamedi.repository.MouseRepositoryImpl;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ComputerService {

//    private ComputerCaseRepositoryImpl computerCaseRepository;
    private MonitorRepositoryImpl monitorRepository;
    private MouseRepositoryImpl mouseRepository;
    private KeyboardRepositoryImpl keyboardRepository;

    public ComputerService(MonitorRepositoryImpl monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    public ComputerService() {

    }

    //    public List<ComputerCase> getAllCompCases(){
//        return computerCaseRepository.getAll();
//    }
    public List<Monitor> getAllMonitors(){
        return monitorRepository.getAll();
    }


}
