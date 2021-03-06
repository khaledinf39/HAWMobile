package de.haw_landshut.hawmobile.base;

import android.arch.persistence.room.*;
import de.haw_landshut.hawmobile.Fakultaet;

import java.util.List;

@Dao
public interface ScheduleDao {

    @Query("SELECT * FROM ProfData")
    List<ProfData> getAllProfs();

    @Query("SELECT DISTINCT fach FROM FaecherData WHERE studiengang=:fakultaet")
    String[] getFaecherByStudiengang(Fakultaet fakultaet);

    @Query("SELECT DISTINCT lastName FROM ProfData")
    String[] getProflastName();


    @Query("SELECT * FROM CustomTimetable")
    List<CustomTimetable>getTimetable();

    @Query("DELETE  FROM CustomTimetable")
    void deleteWholeCustomTimetable();

    @Query("SELECT DISTINCT room FROM RaumData")
    String[] getRooms();

    @Query("SELECT * FROM RaumData")
    RaumData[] getRoomsAndCoords();

    @Insert
    void insertAlleProfs(ProfData... profs);

    @Insert
    void insertAlleFaecher(FaecherData... faecher);

    @Insert
    void insertAllRooms(RaumData... rooms);

    @Insert
    void insertEmptyTimetable(CustomTimetable...customtimetables);

    @Delete
    void deleteProf(ProfData prof);

    @Update
    void updateTimetable(CustomTimetable customTimetable);

       //         scheduleDao.updateTimetable(new CustomTimetable(34, "Blug", "Leichtbau"));

    @Delete
    void deleteFach(FaecherData fach);
}
