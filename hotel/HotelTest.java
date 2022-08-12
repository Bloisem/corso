package hotel;

import hotel.entity.Client;
import hotel.entity.Hotel;

/*В данном домашнем задании нужно написатьсистему бронировния номеров в отеле.
Сущности: Client, Hotel, Room, Bill.

Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на Bill +
В Bill будет сумма денег
Hotel будет содеражть поля: имя отеля, список номеров
Room будет содеражть колличество человек, которых можно разместить, стоимость этого номера и свободен ли этот номер

Сценарии:
Нужно создать нескольких клиентов с счетами и внести им первоначальную сумму. Так же нужно создать
несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
Клиент должен попробовать забронировать номер, для этого он так же указывает
сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.

Так же при бронировании проверять есть ли свободные номера

В одном из сценариев, клиенту должно не хватить денег для бронирования номера

В методе main не нужно проводить никаких операций, кроме создания начальных объектов, сервисов и вызова их методов*/

public class HotelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client clientMario = new Client("Mario", "Biachi", "one@hello.com", "34567876543", 2000);
		Hotel aurora = new Hotel("Aurora");
		Client clientMatteo = new Client("Marco", "Rossi", "one@hello.com", "34567876543", 1000);
		Client clientMirco = new Client("Marco", "Verdi", "one@hello.com", "34567876543", 160);
		aurora.bookHotel(1, clientMirco);
		aurora.bookHotel(5, clientMatteo);
		Hotel vesuvio = new Hotel("Vesuvio");
		vesuvio.findRooms(6);
		vesuvio.bookHotel(0, clientMirco);
		vesuvio.bookHotel(5, clientMario);
		vesuvio.bookHotel(10, clientMario);

	}

}
