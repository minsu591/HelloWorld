package co.edu.practice;

public interface BoardService {
	public int ADD=1;
	public int MOD=2;
	public int REM =3;
	public int LIST =4;
	public int LISTA = 5;
	public int END = 6;
	
	public boolean add(User user);

	public boolean mod();

	public boolean rem();

	public boolean list();

	public boolean listall();

}
