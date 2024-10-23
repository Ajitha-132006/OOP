package main;

import java.util.HashMap;

import java.util.Map;

public class AppointmentBooking {
    private static final Map<String, String[]> doctorSchedules = new HashMap<>();



    static {

        doctorSchedules.put("Neurology", new String[]{"Dr. Neurologist 1 (9am-12pm)", "Dr. Neurologist 2 (12pm-2pm)", "Dr. Neurologist 3 (2pm-5pm)"});

        doctorSchedules.put("Cardiology", new String[]{"Dr. Cardiologist 1 (9am-12pm)", "Dr. Cardiologist 2 (12pm-2pm)", "Dr. Cardiologist 3 (2pm-5pm)"});

        doctorSchedules.put("Dentistry", new String[]{"Dr. Dentist 1 (9am-12pm)", "Dr. Dentist 2 (12pm-2pm)", "Dr. Dentist 3 (2pm-5pm)"});

        doctorSchedules.put("General", new String[]{"Dr. General 1 (9am-12pm)", "Dr. General 2 (12pm-2pm)", "Dr. General 3 (2pm-5pm)"});

        doctorSchedules.put("Gastroenterology", new String[]{"Dr. Gastro 1 (9am-12pm)", "Dr. Gastro 2 (12pm-2pm)", "Dr. Gastro 3 (2pm-5pm)"});

    }



    public static String[] getAvailableDoctors(String sector, String time) {

        String[] availableDoctors = new String[]{};

        switch (time) {

            case "9am-12pm":

                availableDoctors = new String[]{doctorSchedules.get(sector)[0]};

                break;

            case "12pm-2pm":

                availableDoctors = new String[]{doctorSchedules.get(sector)[1]};

                break;

            case "2pm-5pm":

                availableDoctors = new String[]{doctorSchedules.get(sector)[2]};

                break;

        }

        return availableDoctors;

    }
}