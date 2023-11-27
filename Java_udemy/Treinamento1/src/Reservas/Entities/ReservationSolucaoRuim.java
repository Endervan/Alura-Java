package Reservas.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class ReservationSolucaoRuim {

    // static nao deixa pra cada Reservation seja instanciando novamente
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public ReservationSolucaoRuim(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    // calcula datas milissiconds
    public long duracion() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            return "Datas Reservadas deveram ser datas Futuras";
        }
        if (!checkOut.after(checkIn)) {
            return "A data Check In nao poder ser maior que a data de Check Out ";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return "ROOM :" + roomNumber
                + " , checkIn : " + sdf.format(checkIn)
                + " , checkOut: " + sdf.format(checkOut)
                + ", Duração: " + duracion()
                + " nights ";
    }
}
