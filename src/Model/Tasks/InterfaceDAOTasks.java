package Model.Tasks;

import java.util.List;

public interface InterfaceDAOTasks {
    // Method untuk memasukkan suatu data mahasiswa
    public void insert(ModelTask task);
    
    // Method untuk mengupdate (mengedit) suatu data mahasiswa
    public void update(ModelMahasiswa task);
    
    // Method untuk menghapus suatu data mahasiswa
    public void delete(int id);
    
    // Method untuk mengambil data mahasiswa
    public List<ModelTasks> getAll();
}
