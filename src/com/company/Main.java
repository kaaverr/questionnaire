package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2005, Month.JULY , 27);
        System.out.println(date.getDayOfWeek());
        LocalDate jan = LocalDate.of(2021 , Month.JANUARY , 1);
        System.out.println(jan.plusDays(255));

        person max = new person();
        max.setFirstName("Max");
        max.setMidName("Valeriyovych");
        max.setLastName("Hohol");
        max.setCity("Chernovtsy");
        max.setStreet("st.Green");
        max.setHouseNumber("12");
        max.setPhoneNumber("0669223550");
        max.setDateOfBirth(LocalDate.of(2005 , 6 ,27));
        max.setInstitution("National Academy of Internal Affairs");
        max.setSpecialty("Psychology");
        max.setSpecialization("Psychologist");
        max.setDocuments("GUNP in the Chernivtsi region");
        max.setManagement("Chernivtsi District Police Department");
        max.setDepartment("Police station №2 (Kitsman)");
        max.setBecomeA("Man");
        max.setCitizenship("Of Ukraine");
        max.setPlaceOfBirth("Ukraine");
        max.setRegion("Chernivtsi");
        System.out.println(max);
    }
}