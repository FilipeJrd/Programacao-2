package data.interfaces;

import org.bson.Document;
import exceptions.ItemNotFoundException;

public interface IModelController<T> {
	 Document convertToDocument(T obj);
	 T convertToObject(Document doc, IRepositoryController rep);
}
