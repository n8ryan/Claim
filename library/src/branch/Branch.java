package branch;

import java.util.ArrayList;

import library.Library;


public class Branch {
	
	private String name;
	private ArrayList<Library> libraries = new ArrayList<Library>();

	public Branch(){}
	public Branch(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Library> getLibraries() {
		return libraries;
	}
	public void setLibraries(ArrayList<Library> libraries) {
		this.libraries = libraries;
	}
	public void addLibrary(Library lib){
		this.libraries.add(lib);
	}
	public void removeLibrary(Library lib){
		if(this.libraries.contains(lib)){
			this.libraries.remove(lib);
		}
	}
}
