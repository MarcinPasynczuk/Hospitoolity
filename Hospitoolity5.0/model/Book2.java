package main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Book2 {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	private String test;	
	

	private String test1;

	private String test2;

	private String test3;

	private String test4;

	private String test5;

	private String test6;

	private String test7;

	private String test8;

	private String test9;

	private String test10;

	private String test11;

	private String test12;

	private String test13;

	private String test14;

	private String test15;

	private String test16;

	private String test17;

	private String test47;
	
	private String test48;
	
	private String test49;
	
	private String test50;
	
	private String test51;
	
	private String test52;
	
	private String test53;
	
	private String test54;
	
	private String test55;
	
	private String test56;

	private String test57;
	
	private String test58;
	
	private String test59;
	
	private String test60;
	
	private String test61;
	
	private String test62;
	
	private String test63;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTest1() {
		return test1;
	}

	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getTest2() {
		return test2;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
	}

	public String getTest3() {
		return test3;
	}

	public void setTest3(String test3) {
		this.test3 = test3;
	}

	public String getTest4() {
		return test4;
	}

	public void setTest4(String test4) {
		this.test4 = test4;
	}

	public String getTest5() {
		return test5;
	}

	public void setTest5(String test5) {
		this.test5 = test5;
	}

	public String getTest6() {
		return test6;
	}

	public void setTest6(String test6) {
		this.test6 = test6;
	}

	public String getTest7() {
		return test7;
	}

	public void setTest7(String test7) {
		this.test7 = test7;
	}

	public String getTest8() {
		return test8;
	}

	public void setTest8(String test8) {
		this.test8 = test8;
	}

	public String getTest9() {
		return test9;
	}

	public void setTest9(String test9) {
		this.test9 = test9;
	}

	public String getTest10() {
		return test10;
	}

	public void setTest10(String test10) {
		this.test10 = test10;
	}

	public String getTest11() {
		return test11;
	}

	public void setTest11(String test11) {
		this.test11 = test11;
	}

	public String getTest12() {
		return test12;
	}

	public void setTest12(String test12) {
		this.test12 = test12;
	}

	public String getTest13() {
		return test13;
	}

	public void setTest13(String test13) {
		this.test13 = test13;
	}

	public String getTest14() {
		return test14;
	}

	public void setTest14(String test14) {
		this.test14 = test14;
	}

	public String getTest15() {
		return test15;
	}

	public void setTest15(String test15) {
		this.test15 = test15;
	}

	public String getTest16() {
		return test16;
	}

	public void setTest16(String test16) {
		this.test16 = test16;
	}

	public String getTest17() {
		return test17;
	}

	public void setTest17(String test17) {
		this.test17 = test17;
	}

	public String getTest47() {
		return test47;
	}

	public void setTest47(String test47) {
		this.test47 = test47;
	}

	public String getTest48() {
		return test48;
	}

	public void setTest48(String test48) {
		this.test48 = test48;
	}

	public String getTest49() {
		return test49;
	}

	public void setTest49(String test49) {
		this.test49 = test49;
	}

	public String getTest50() {
		return test50;
	}

	public void setTest50(String test50) {
		this.test50 = test50;
	}

	public String getTest51() {
		return test51;
	}

	public void setTest51(String test51) {
		this.test51 = test51;
	}

	public String getTest52() {
		return test52;
	}

	public void setTest52(String test52) {
		this.test52 = test52;
	}

	public String getTest53() {
		return test53;
	}

	public void setTest53(String test53) {
		this.test53 = test53;
	}

	public String getTest54() {
		return test54;
	}

	public void setTest54(String test54) {
		this.test54 = test54;
	}

	public String getTest55() {
		return test55;
	}

	public void setTest55(String test55) {
		this.test55 = test55;
	}

	public String getTest56() {
		return test56;
	}

	public void setTest56(String test56) {
		this.test56 = test56;
	}

	public String getTest57() {
		return test57;
	}

	public void setTest57(String test57) {
		this.test57 = test57;
	}

	public String getTest58() {
		return test58;
	}

	public void setTest58(String test58) {
		this.test58 = test58;
	}

	public String getTest59() {
		return test59;
	}

	public void setTest59(String test59) {
		this.test59 = test59;
	}

	public String getTest60() {
		return test60;
	}

	public void setTest60(String test60) {
		this.test60 = test60;
	}

	public String getTest61() {
		return test61;
	}

	public void setTest61(String test61) {
		this.test61 = test61;
	}

	public String getTest62() {
		return test62;
	}

	public void setTest62(String test62) {
		this.test62 = test62;
	}

	public String getTest63() {
		return test63;
	}

	public void setTest63(String test63) {
		this.test63 = test63;
	}

}
