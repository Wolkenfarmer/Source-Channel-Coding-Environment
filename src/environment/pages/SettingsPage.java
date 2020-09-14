package environment.pages;

import environment.ExperimentElement;
import environment.Main;
import environment.pages.guiElements.InformationSegment;
import environment.pages.guiElements.OptionButton;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;

/**
 * Abstract class for the sub-pages {@link InfSourcePage}, {@link EnDecoderPage} and {@link NoiSourcePage} .
 * Gets used for {@link OptionButton} and {@link InformationSegment} in order to have a unified access to the pages / 
 * implement a unified system for handling the pages.
 * @author Wolkenfarmer
 */
public abstract class SettingsPage {
	/** Layout container representing the given root from {@link Homepage home page} to attach the GUI-elements to.
	 * It's content ({@link #tfHeading}, {@link #pOverview}, {@link #pOptions}, {@link #pInformation}) gets build in the corresponding constructors.
	 * When loading another page it's content gets first removed and then the layout container will be given to the other class.
	 * When reloading the page {@link #reload(Group)} will be used to re-attach the content to the root.*/
	static Group root;
	/** Layout container for the heading segment. 
	 * It's content will be added in the constructors of the sub-classes. It gets added to {@link #root}.*/
	TextFlow tfHeading;
	/** Layout container for the overview segment. 
	 * It's content will be added in the constructors of the sub-classes. It gets added to {@link #root}.*/
	Pane pOverview;
	/** Layout container for the options segment. It's content will be added in the constructors of the sub-classes.
	 * Contains {@link #lOptHeading} and {@link #vbOptButtons} and gets added to {@link #root}.*/
	Pane pOptions;
		/** Label which displays the sub-heading "Options". It's part of {@link #pOptions}.*/
		Label lOptHeading;
		/** Layout container for the buttons of options. It's content will be added in the constructors of the sub-classes. 
		 * It's part of {@link #pOptions}.*/
		public VBox vbOptButtons;
	/** Layout container for the information segment. 
	 * Displays the information of the selected {@link ExperimentElement experiment element} in {@link #pOptions}.
	 * It gets added to {@link #root}.
	 * @see InformationSegment*/
	InformationSegment pInformation;
	
	
	/**
	 * Reloads the settings page. Re-attaches the page's elements ({@link #tfHeading}, {@link #pOverview}, {@link #pOptions}, 
	 * {@link #pInformation}) and {@link Main#krlBackHome}. In addition, {@link Main#updateScrollbar(Region)} gets called 
	 * (see constructors for more information relating to it's view-cases).
	 * This method gets called by the {@link Homepage home page}, 
	 * when the page is already not null and the corresponding button(s) get(s) pressed.
	 * @param parent Layout container to attach it's layout parts to.
	 */
	void reload(Group parent) {
		root = parent;
		Main.updateScrollbar(pOptions);
		root.getChildren().addAll(tfHeading, pOverview, pOptions, pInformation);
		Main.scene.setOnKeyReleased(Main.krlBackHome);		
	}
	
	
	/**
	 * Sets the on-key-released-listener {@link Main#krlBackHome} for the scene. 
	 * Gets called when building the page or {@link #reload(Group) reloading}.
	 */
	void addListener() {
		Main.scene.setOnKeyReleased(Main.krlBackHome);
	}
	
	
	/**
	 * Updates the {@link #pOverview overview's} model to fit the selected element in {@link Main}.
	 * @param changed Specifies what has to be updated in the model.
	 */
	public abstract void updateOveModel(byte changed);
}
