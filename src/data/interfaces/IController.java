package data.interfaces;

import org.bson.Document;

import models.Game;

public interface IController<T> {
	 Document convertToDocument(T obj);
	 T convertToObject(Document doc);
}
