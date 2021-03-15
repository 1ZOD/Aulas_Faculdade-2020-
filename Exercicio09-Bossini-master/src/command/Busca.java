package command;

import java.util.ArrayList;

import model.Pais;

public class Busca {
	public static int busca(int id, ArrayList<Pais>lista) {
		Pais to;
		System.out.println(id);
		for(int i=0;i<lista.size();i++){
			to=lista.get(i);
			System.out.println(to);
			if(to.getId() == id){
				return i;
			}
			
		}
		return-1;
	}

}
