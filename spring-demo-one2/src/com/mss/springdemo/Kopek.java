package com.mss.springdemo;

public class Kopek implements Hayvan {

	private GunlukYemekService gunlukYemekService;
	
	private String kopekSesi;
	private String kopekIsmi;

	public Kopek() {
		super();
		System.out.println("Kopek : constroctur method");
	}

	@Override
	public String getAntreman() {
	return "5 km yüreyelim.";
	}

	@Override
	public String getGunlukYemek() {
		// TODO Auto-generated method stub
		return gunlukYemekService.getGunlukYemek();
	}

	public void setGunlukYemekService(GunlukYemekService gunlukYemekService) {
		System.out.println("Kopek: setter method");
		this.gunlukYemekService = gunlukYemekService;
	}

	public String getKopekSesi() {
		return kopekSesi;
	}

	public void setKopekSesi(String kopekSesi) {
		System.out.println("Spring setledigi kopek sesi: " +kopekSesi);
		this.kopekSesi = kopekSesi;
	}

	public String getKopekIsmi() {
		return kopekIsmi;
	}

	public void setKopekIsmi(String kopekIsmi) {
		System.out.println("Spring setledigi kopek ismi: " +kopekIsmi);
		this.kopekIsmi = kopekIsmi;
	}
	
	
	
	


	
	
	
}
