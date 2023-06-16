package Lesson5;

import Lesson5.models.Reservation;
import Lesson5.models.Table;
import Lesson5.models.TableModel;
import Lesson5.presenters.BookingPresenter;
import Lesson5.presenters.Model;
import Lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");

        for (Table table: tableModel.loadTables()) {
            for (Reservation res: table.getReservations()) {
                System.out.println(res.getId());
                System.out.println(res.getName());
                System.out.println(res.getDate());
            }
        }

        bookingView.changeReservationTable(9001,new Date(),102,"Оля");

        for (Table table: tableModel.loadTables()) {
            for (Reservation res: table.getReservations()) {
                System.out.println(res.getId());
                System.out.println(res.getName());
                System.out.println(res.getDate());
            }
        }
    }

}
