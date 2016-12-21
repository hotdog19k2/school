package shcool.dao;

import java.util.List;

public interface interfaceDao<T> {
	void insertItem(T item);
	void deleteItem(int idx);
	void updataItem(T item);
	T selectByNo(int idx);
	List<T> selectByAll();
}
