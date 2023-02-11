package main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Book {
	
	
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

	private String test18;

	private String test19;

	private String test20;

	private String test21;

	private String test22;

	private String test23;

	private String test24;

	private String test25;

	private String test26;

	private String test27;
	
	private String test28;
	
	private String test29;
	
	private String test30;
	
	private String test31;
	
	private String test32;
	
	private String test33;
	
	private String test34;
	
	private String test35;
	
	private String test36;
	
	private String test37;
	
	private String test38;
	
	private String test39;
	
	private String test40;
	
	private String test41;
	
	private String test42;
	
	private String test43;
	
	private String test44;
	
	private String test45;
	
	private String test46;
	

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

	public String getTest18() {
		return test18;
	}

	public void setTest18(String test18) {
		this.test18 = test18;
	}

	public String getTest19() {
		return test19;
	}

	public void setTest19(String test19) {
		this.test19 = test19;
	}

	public String getTest20() {
		return test20;
	}

	public void setTest20(String test20) {
		this.test20 = test20;
	}

	public String getTest21() {
		return test21;
	}

	public void setTest21(String test21) {
		this.test21 = test21;
	}

	public String getTest22() {
		return test22;
	}

	public void setTest22(String test22) {
		this.test22 = test22;
	}

	public String getTest23() {
		return test23;
	}

	public void setTest23(String test23) {
		this.test23 = test23;
	}

	public String getTest24() {
		return test24;
	}

	public void setTest24(String test24) {
		this.test24 = test24;
	}

	public String getTest25() {
		return test25;
	}

	public void setTest25(String test25) {
		this.test25 = test25;
	}

	public String getTest26() {
		return test26;
	}

	public void setTest26(String test26) {
		this.test26 = test26;
	}

	public String getTest27() {
		return test27;
	}

	public void setTest27(String test27) {
		this.test27 = test27;
	}

	public String getTest28() {
		return test28;
	}

	public void setTest28(String test28) {
		this.test28 = test28;
	}

	public String getTest29() {
		return test29;
	}

	public void setTest29(String test29) {
		this.test29 = test29;
	}

	public String getTest30() {
		return test30;
	}

	public void setTest30(String test30) {
		this.test30 = test30;
	}

	public String getTest31() {
		return test31;
	}

	public void setTest31(String test31) {
		this.test31 = test31;
	}

	public String getTest32() {
		return test32;
	}

	public void setTest32(String test32) {
		this.test32 = test32;
	}

	public String getTest33() {
		return test33;
	}

	public void setTest33(String test33) {
		this.test33 = test33;
	}

	public String getTest34() {
		return test34;
	}

	public void setTest34(String test34) {
		this.test34 = test34;
	}

	public String getTest35() {
		return test35;
	}

	public void setTest35(String test35) {
		this.test35 = test35;
	}

	public String getTest36() {
		return test36;
	}

	public void setTest36(String test36) {
		this.test36 = test36;
	}

	public String getTest37() {
		return test37;
	}

	public void setTest37(String test37) {
		this.test37 = test37;
	}

	public String getTest38() {
		return test38;
	}

	public void setTest38(String test38) {
		this.test38 = test38;
	}

	public String getTest39() {
		return test39;
	}

	public void setTest39(String test39) {
		this.test39 = test39;
	}

	public String getTest40() {
		return test40;
	}

	public void setTest40(String test40) {
		this.test40 = test40;
	}

	public String getTest41() {
		return test41;
	}

	public void setTest41(String test41) {
		this.test41 = test41;
	}

	public String getTest42() {
		return test42;
	}

	public void setTest42(String test42) {
		this.test42 = test42;
	}

	public String getTest43() {
		return test43;
	}

	public void setTest43(String test43) {
		this.test43 = test43;
	}

	public String getTest44() {
		return test44;
	}

	public void setTest44(String test44) {
		this.test44 = test44;
	}

	public String getTest45() {
		return test45;
	}

	public void setTest45(String test45) {
		this.test45 = test45;
	}

	public String getTest46() {
		return test46;
	}

	public void setTest46(String test46) {
		this.test46 = test46;
	}

}
