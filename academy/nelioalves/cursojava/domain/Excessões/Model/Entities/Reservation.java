package Repositorio_Estudos_JAVA.academy.nelioalves.cursojava.domain.Excessões.Model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    /* Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada
    e data de saída) e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida,
    ler novas datas de entrada e saída, atualizar a reserva, e mostrar novamente a reserva, conforme as seguintes regras:
    - Alterações de reserva só podem ocorrer para datas futuras
    - A data de saída deve ser maior que a data de entrada
     */

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public long duration() {
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkin, Date checkout) {

        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)){
            return "Error in reservation: reservation dates for update must be future";
        }

        if (!checkout.after(checkin)) {
           return "Error in reservation: Reservation dates must be after checkout";
        }
        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkin)
                + ", check-out: "
                + sdf.format(checkout)
                + ", "
                + duration()
                + " nights";
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }
}
