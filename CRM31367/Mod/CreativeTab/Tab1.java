package CRM31367.Mod.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;

public class Tab1 extends CreativeTabs {

	private int displayID = 0;
	private String displayName = "";

	public Tab1(int id, String name, int disID) {
		super(id, name);
		displayName = name;
		displayID = disID;
	}
	
	@Override
	public int getTabIconItemIndex() {
	return displayID;
	}

	@Override
	public String getTranslatedTabLabel() {
	return displayName;
	}
	
}