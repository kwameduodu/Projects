package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daos.models.TestTable;

public class TestTableDAO implements Dao<TestTable>{
    private List<TestTable> testTables;
    Connection connection;

    public TestTableDAO(Connection conn) {
        testTables = new ArrayList<>();
        connection = conn;
    }

    @Override
    public TestTable get(int id) throws SQLException {
    	String sql = "select * FROM test_table WHERE string_id = ?";
    	PreparedStatement pstmt =connection.prepareStatement(sql);
    	pstmt.setInt(1, id);
    	
    	ResultSet rs = pstmt.executeQuery();
    	
    	TestTable row = new TestTable();
    	row.setStringId(rs.getInt("String_id"));
    	row.setStringId(rs.getInt("String"));
    	
        return row;
    }

    @Override
    public List<TestTable> getAll() throws SQLException {
        String sql = "SELECT * FROM test_table";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while(rs.next()) {
            TestTable row = new TestTable();
            row.setStringId(rs.getInt("string_id"));
            row.setString(rs.getString("string"));
            testTables.add(row);
        }
        return testTables;
    }

    @Override
    public void save(TestTable testTable) throws SQLException {
        String sql = "INSERT INTO test_table (string) VALUES (?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, testTable.getString());


        if(pstmt.executeUpdate() > 0) {
            ResultSet rs = pstmt.getResultSet();
        }


    }

    @Override
    public void update(TestTable testTable, String[] params) {

    }

	@Override
	public void delect(TestTable testTable) {
		// TODO Auto-generated method stub
		
	}

}