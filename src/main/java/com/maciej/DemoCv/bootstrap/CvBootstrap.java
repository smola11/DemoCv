/*
package com.maciej.DemoCv.bootstrap;

import com.maciej.DemoCv.entity.Cv;
import com.maciej.DemoCv.entity.Employee;
import com.maciej.DemoCv.entity.Skill;
import com.maciej.DemoCv.entity.User;
import com.maciej.DemoCv.repositories.CvRepository;
import com.maciej.DemoCv.repositories.EmployeeRepository;
import com.maciej.DemoCv.repositories.SkillRepository;
import com.maciej.DemoCv.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class CvBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private EmployeeRepository employeeRepository;
    private SkillRepository skillRepository;
    private UserRepository userRepository;
    private CvRepository cvRepository;

    public CvBootstrap(EmployeeRepository employeeRepository, SkillRepository skillRepository, UserRepository userRepository, CvRepository cvRepository) {
        this.employeeRepository = employeeRepository;
        this.skillRepository = skillRepository;
        this.userRepository = userRepository;
        this.cvRepository = cvRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        // CVs
        Cv maciejCv = new Cv();
        maciejCv.setLastUpdated(new Timestamp(System.currentTimeMillis()));
        maciejCv.setUserDescription("I am biotechnologist ready to learn programming");

        Cv piotrCv = new Cv();
        piotrCv.setLastUpdated(new Timestamp(System.currentTimeMillis()));
        piotrCv.setUserDescription("I am friend of Maciej who is also ready to learn programming");

        cvRepository.save(maciejCv);
        cvRepository.save(piotrCv);

        // Skills
        List<Skill> skills = new ArrayList<>(4);

        Skill skill1 = new Skill();
        skill1.setSkillGroup("Language");
        skill1.setSkillName("Java");
        skill1.setCv(maciejCv);

        Skill skill2 = new Skill();
        skill2.setSkillGroup("Framework");
        skill2.setSkillName("Spring");
        skill2.setCv(maciejCv);

        Skill skill3 = new Skill();
        skill3.setSkillGroup("Testing");
        skill3.setSkillName("Protractor");
        skill3.setCv(piotrCv);

        Skill skill4 = new Skill();
        skill4.setSkillGroup("Library");
        skill4.setSkillName("Guava");
        skill4.setCv(null);

        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
        skills.add(skill4);

        skillRepository.saveAll(skills);

        // Employyes
        List<Employee> employees = new ArrayList<>(2);
        Employee employee1 = new Employee();
        employee1.setCvAccepted(maciejCv);
        employee1.setDescription("I am employee1");
        employee1.setHired(true);
        Employee employee2 = new Employee();
        employee2.setHired(true);
        employee2.setDescription("I am employee2");
        employee2.setCvAccepted(piotrCv);
        employees.add(employee1);
        employees.add(employee2);

        employeeRepository.saveAll(employees);

        // Users
        List<User> users = new ArrayList<>(2);
        User user1 = new User();
        user1.setCv(maciejCv);
        user1.setEmail("smola11@o2.pl");
        user1.setEmployee(employee1);
        user1.setFirstName("Maciej");
        user1.setLastName("Smolarz");

        User user2 = new User();
        user2.setCv(piotrCv);
        user2.setEmail("piotrsz1@o2.pl");
        user2.setEmployee(employee2);
        user2.setFirstName("Piotr");
        user2.setLastName("Szefner");

        users.add(user1);
        users.add(user2);

        userRepository.saveAll(users);
    }
}
*/
