package io.github.sunshinewzy.designpattern.creational.factory;

public class AbstractFactory {

	public static void main(String[] args) {
		IDatabaseUtils iDatabaseUtils = new MySQLDatabaseUtils();
		iDatabaseUtils.getConnection().connect();
		iDatabaseUtils.getCommand().command();
		
		iDatabaseUtils = new OracleDatabaseUtils();
		iDatabaseUtils.getConnection().connect();
		iDatabaseUtils.getCommand().command();
	}
	
}


interface IConnection {
	void connect();
}

interface ICommand {
	void command();
}

interface IDatabaseUtils {
	IConnection getConnection();
	ICommand getCommand();
}

class MySQLConnection implements IConnection {
	@Override
	public void connect() {
		System.out.println("MySQL connected.");
	}
}

class MySQLCommand implements ICommand {
	@Override
	public void command() {
		System.out.println("MySQL command called.");
	}
}

class MySQLDatabaseUtils implements IDatabaseUtils {
	@Override
	public IConnection getConnection() {
		return new MySQLConnection();
	}

	@Override
	public ICommand getCommand() {
		return new MySQLCommand();
	}
}

class OracleConnection implements IConnection {
	@Override
	public void connect() {
		System.out.println("Oracle connected.");
	}
}

class OracleCommand implements ICommand {
	@Override
	public void command() {
		System.out.println("Oracle command called.");
	}
}

class OracleDatabaseUtils implements IDatabaseUtils {
	@Override
	public IConnection getConnection() {
		return new OracleConnection();
	}

	@Override
	public ICommand getCommand() {
		return new OracleCommand();
	}
}