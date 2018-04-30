package dja.housecleaning.company;

import dja.housecleaning.company.assets.Software;
import dja.housecleaning.company.assets.Storage;
import dja.housecleaning.company.assets.Vehicles;
import dja.housecleaning.company.jobpositions.Accountant;
import dja.housecleaning.company.jobpositions.Assistant;
import dja.housecleaning.company.jobpositions.Cleaner;
import dja.housecleaning.company.jobpositions.Receptionist;
import dja.housecleaning.company.staff.Andrey;
import dja.housecleaning.company.staff.HarryHouse;
import dja.housecleaning.company.staff.Ronald;
import other.things.BookkeepingSystem;
import other.things.CleaningSupplyStore;
import other.things.CleaningTool;
import other.things.Van;

public class HouseCleaning {

	public static final HouseCleaning COMPANY = new HouseCleaning();
	
	private HouseCleaning() {
		Storage storage = getStorage();
		storage.cleaningTools.add(new CleaningTool("vaccume cleaner"));
		storage.cleaningTools.add(new CleaningTool("floor mop"));
		storage.cleaningTools.add(new CleaningTool("glass wiper"));
		// ... 
		storage.cleaningSupplies.add(CleaningSupplyStore.purchase("carpet cleaner"));
		storage.cleaningSupplies.add(CleaningSupplyStore.purchase("wood cleaner"));
		storage.cleaningSupplies.add(CleaningSupplyStore.purchase("glass cleaner"));
		// ... 
	}
	
	
	public Receptionist getReceptionist () {
		return Ronald.PERSON;
	}

	public Accountant getAccountant() {
		return HarryHouse.PERSON;
	}

	public Assistant getAssistant() {
		return Andrey.PERSON;
	}

	public Cleaner getCleaner() {
		return HarryHouse.PERSON;
	}
	
	public Van getCompanyVan() {
		return Vehicles.companyVan;
	}

	public BookkeepingSystem getBookkeepingSystem() {
		return Software.companyBookkepingsystem;
	}

	public Storage getStorage() {
		return Storage.PLACE;
	}

}