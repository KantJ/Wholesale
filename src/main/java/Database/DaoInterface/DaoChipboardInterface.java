package Database.DaoInterface;

import java.util.List;

public interface DaoChipboardInterface {
  String selectById = "FROM Chipboard " +
          "WHERE id = :id";

  String selectBySizeId = "FROM Chipboard " +
          "WHERE sizeId = :sizeId";

  String priceOfId = "FROM Chipboard " +
          "WHERE id = :id";

  void insert(Object object);
  List select(String q, int id);
  List select();
}
