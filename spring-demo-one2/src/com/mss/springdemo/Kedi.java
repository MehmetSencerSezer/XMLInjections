package com.mss.springdemo;

public class Kedi implements Hayvan {

	GunlukYemekService gunlukYemekService;
	

	public Kedi(GunlukYemekService gunlukYemekService) {
		super();
		System.out.println("Kedi: constroctur method");
		this.gunlukYemekService = gunlukYemekService;
	}

	@Override
	public String getAntreman() {
		// TODO Auto-generated method stub
		return "Ne antremaný ben yatarým.";
	}

	@Override
	public String getGunlukYemek() {
		// TODO Auto-generated method stub
		return gunlukYemekService.getGunlukYemek();
	}

	public void setGunlukYemekService(GunlukYemekService gunlukYemekService) {
		System.out.println("Kedi: setter method");
		this.gunlukYemekService = gunlukYemekService;
	}


	
	

}
