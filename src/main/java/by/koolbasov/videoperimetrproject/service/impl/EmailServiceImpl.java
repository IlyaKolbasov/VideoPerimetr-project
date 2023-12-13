package by.koolbasov.videoperimetrproject.service.impl;

import by.koolbasov.videoperimetrproject.dto.ArchiveInfoDto;
import by.koolbasov.videoperimetrproject.entity.ArchiveInfo;
import by.koolbasov.videoperimetrproject.mapper.ArchiveInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl {
    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(ArchiveInfoDto archiveInfodto)
    {
        ArchiveInfo archiveInfo = ArchiveInfoMapper.MAPPER.toArchiveInfo(archiveInfodto);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("kolbiskolbis@gmail.ru");
        message.setSubject("Видеопериметр! Запрос Видеоархива");
        message.setText("Имя, фамилия: " + archiveInfo.getFirstName()+" "+archiveInfo.getLastName()+"\n"+
                        "Город: " + archiveInfo.getCity()+"\n"+
                        "Улица,дом: " + archiveInfo.getStreet() + archiveInfo.getBuildingNumber()+"\n"+
                        "Номер квартиры: " + archiveInfo.getFlatNumber()+"\n"+
                        "Период с "+archiveInfo.getFromTime()+" "+ archiveInfo.getFromDate() +
                        " по "+archiveInfo.getToTime()+" "+archiveInfo.getToDate() +"\n"+
                        "Email: "+archiveInfo.getEmail()+"\n"+
                        "Телефон: "+archiveInfo.getNumber()
        );

        emailSender.send(message);
    }
}
