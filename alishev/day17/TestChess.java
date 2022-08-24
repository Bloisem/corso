package alishev.day17;

public class TestChess {

	public static void main(String[] args) {
		ChessPiece[] chessArray = new ChessPiece[8];
		chessArray[0] = ChessPiece.PAWN_WHITE;
		chessArray[1] = ChessPiece.PAWN_WHITE;
		chessArray[2] = ChessPiece.PAWN_WHITE;
		chessArray[3] = ChessPiece.PAWN_WHITE;
		chessArray[4] = ChessPiece.ROOK_BLACK;
		chessArray[5] = ChessPiece.ROOK_BLACK;
		chessArray[6] = ChessPiece.ROOK_BLACK;
		chessArray[7] = ChessPiece.ROOK_BLACK;
		for (ChessPiece a : chessArray) {
			System.out.print(a.getRepresentation() + " ");
			
		}
		System.out.println("\nTask 2 ");

		ChessPiece[][] game = {
				{ ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY },
				{ ChessPiece.EMPTY, ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK,
						ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK },
				{ ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY },
				{ ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY,
						ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY },
				{ ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE,
						ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY },
				{ ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE,
						ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY },
				{ ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY,
						ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE },
				{ ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,
						ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY }

		};
		ChessBoard chessGame2000 = new ChessBoard(game);
		System.out.println(chessGame2000);
	}
}
/*
 * 1. Создайте Enum “Шахматная фигура” (англ. ChessPiece). Всего существует 6
 * различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья
 * (англ. rook), слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
 * В нашей программе, у каждой шахматной фигуры есть следующие характеристики: ●
 * Ценность фигуры - вещественное число ● Строковое обозначение фигуры
 * 
 * В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных.
 * Названия фигур в перечислении должны иметь следующий вид: KING_WHITE,
 * KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее У каждой фигуры должны быть
 * заданы две характеристики - ее ценность и строковое обозначение. Ценности
 * шахматных фигур приведены в таблице: Пешка 1 Конь 3 Слон 3.5 Ладья 5 Ферзь 9
 * Король 100 Строковые обозначения шахматных фигур приведены в таблице: Пешка
 * (белая) ♙ Конь (белый) ♘ Слон (белый) ♗ Ладья (белая) ♖ Ферзь (белый) ♕
 * Король (белый) ♔ Пешка (черная) ♟ Конь (черный) ♞ Слон (черный) ♝ Ладья
 * (черная) ♜ Ферзь (черный) ♛ Король (черный) ♚ Используя созданный enum, в
 * методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4
 * черных ладьи. Выведите содержимое этого массива на экран, используя строковые
 * обозначения шахматных фигур. Вывод в консоль должен быть таким: ♙ ♙ ♙ ♙ ♜ ♜ ♜
 * ♜ 2. Добавьте новую “фигуру” в enum ChessPiece, которая будет называться
 * EMPTY. Эта “фигура” будет обозначать пустое пространство на шахматной доске.
 * Ценность этой фигуры равна -1, а строковое обозначение равно нижнему
 * подчеркиванию ("_"). Затем создайте класс Шахматная доска (англ. ChessBoard).
 * Этот класс в единственном аргументе конструктора должен принимать на вход
 * двумерный массив шахматных фигур. Этот двумерный массив задает конфигурацию
 * фигур на шахматной доске. Пустое пространство на шахматной доске задается с
 * помощью значения EMPTY. Также, у класса ChessBoard должен быть реализован
 * метод print(), который выводит шахматную доску в консоль. В методе main()
 * класса Task2 создайте новый объект класса ChessBoard, передав ему в качестве
 * аргумента двумерный массив с расположением фигур как на картинке ниже (матч
 * Крамник - Каспаров 2000 года). Затем, используя метод print() выведите
 * шахматную доску в консоль, используя строковые обозначения шахматных фигур.
 * Вывод в консоль должен быть таким: 
 * ♜____♜♚_
 *_♖__♟♟_♟
 *♟_♞___♟_
 *♛__♗____
 *___♝♙___
 *____♗♙__
 *♙__♕_♙_♙
 *_____♖♔_
 */