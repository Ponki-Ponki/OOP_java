package dz3;

import dz3.Figures.*;
import dz3.Figures.Base.*;

public class Program {
	public static void main(String[] args) {
		ListFigure figures = new ListFigure();
		figures.addFigure(new Triangle()); // добавление фигуры
		figures.addFigure(new Rectangle()); // добавление фигуры
		figures.addFigure(new Circle()); // добавление фигуры
		figures.addFigure(new Square()); // добавление фигуры

		figures.printFigureInfo(); // Вывод информации
		figures.getPerimetrAll(); //получить периметр всех фигур и вывод на экран
		figures.getAreaAll(); // выпод всех плоадей всех фигур в списке
		figures.removeItem(1);// удалить элемент в списке фигур
		figures.printFigureInfo();
		figures.sort(); // сортировка списка
		figures.printFigureInfo();
		figures.editFigure(0); // изменение фигуры и вывод новых данных по этой фигуре
	
	}
}
