package org.httpkit.dbcp;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;

public class DelegateConnection implements Connection {

    protected final Connection real;

    public DelegateConnection(Connection real) {
        this.real = real;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return real.unwrap(iface);
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return real.isWrapperFor(iface);
    }

    public Statement createStatement() throws SQLException {
        return real.createStatement();
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return real.prepareStatement(sql);
    }

    public CallableStatement prepareCall(String sql) throws SQLException {
        return real.prepareCall(sql);
    }

    public String nativeSQL(String sql) throws SQLException {
        return real.nativeSQL(sql);
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {
        real.setAutoCommit(autoCommit);
    }

    public boolean getAutoCommit() throws SQLException {
        return real.getAutoCommit();
    }

    public void commit() throws SQLException {
        real.commit();

    }

    public void rollback() throws SQLException {
        real.rollback();
    }

    public void close() throws SQLException {
        real.close();
    }

    public boolean isClosed() throws SQLException {
        return real.isClosed();
    }

    public DatabaseMetaData getMetaData() throws SQLException {
        return real.getMetaData();
    }

    public void setReadOnly(boolean readOnly) throws SQLException {
        real.setReadOnly(readOnly);

    }

    public boolean isReadOnly() throws SQLException {
        return real.isReadOnly();
    }

    public void setCatalog(String catalog) throws SQLException {
        real.setCatalog(catalog);

    }

    public String getCatalog() throws SQLException {
        return real.getCatalog();
    }

    public void setTransactionIsolation(int level) throws SQLException {
        real.setTransactionIsolation(level);

    }

    public String toString() {
        return real.toString();
    }

    public int getTransactionIsolation() throws SQLException {
        return real.getTransactionIsolation();
    }

    public SQLWarning getWarnings() throws SQLException {
        return real.getWarnings();
    }

    public void clearWarnings() throws SQLException {
        real.clearWarnings();
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency)
            throws SQLException {
        return real.createStatement(resultSetType, resultSetConcurrency);
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType,
            int resultSetConcurrency) throws SQLException {
        return real.prepareStatement(sql, resultSetType, resultSetConcurrency);
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
            throws SQLException {
        return real.prepareCall(sql, resultSetType, resultSetConcurrency);
    }

    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return real.getTypeMap();
    }

    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        real.setTypeMap(map);

    }

    public void setHoldability(int holdability) throws SQLException {
        real.setHoldability(holdability);

    }

    public int getHoldability() throws SQLException {
        return real.getHoldability();
    }

    public Savepoint setSavepoint() throws SQLException {
        return real.setSavepoint();
    }

    public Savepoint setSavepoint(String name) throws SQLException {
        return real.setSavepoint(name);
    }

    public void rollback(Savepoint savepoint) throws SQLException {
        real.rollback(savepoint);
    }

    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        real.releaseSavepoint(savepoint);
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency,
            int resultSetHoldability) throws SQLException {
        return real.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType,
            int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return real.prepareStatement(sql, resultSetType, resultSetConcurrency,
                resultSetHoldability);
    }

    public CallableStatement prepareCall(String sql, int resultSetType,
            int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return real.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
            throws SQLException {
        return real.prepareStatement(sql, autoGeneratedKeys);
    }

    public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
            throws SQLException {
        return real.prepareStatement(sql, columnIndexes);
    }

    public PreparedStatement prepareStatement(String sql, String[] columnNames)
            throws SQLException {
        return real.prepareStatement(sql, columnNames);
    }

    public Clob createClob() throws SQLException {
        return real.createClob();
    }

    public Blob createBlob() throws SQLException {
        return real.createBlob();
    }

    public NClob createNClob() throws SQLException {
        return real.createNClob();
    }

    public SQLXML createSQLXML() throws SQLException {
        return real.createSQLXML();
    }

    public boolean isValid(int timeout) throws SQLException {
        return real.isValid(timeout);
    }

    public void setClientInfo(String name, String value) throws SQLClientInfoException {
        real.setClientInfo(name, value);

    }

    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        real.setClientInfo(properties);
    }

    public String getClientInfo(String name) throws SQLException {
        return real.getClientInfo(name);
    }

    public Properties getClientInfo() throws SQLException {
        return real.getClientInfo();
    }

    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return real.createArrayOf(typeName, elements);
    }

    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return real.createStruct(typeName, attributes);
    }
}
