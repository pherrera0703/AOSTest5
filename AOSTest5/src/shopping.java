import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.Desktop;
import org.junit.Assert;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;

public class shopping {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'http://nimbusserver:8000/#/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
		desktop.<BrowserApplication> find("//BrowserApplication").maximize();
	}

	@Test
	public void speakers() {
/*
		desktop.<DomElement>find("nimbusserver.BrowserWindow.speakersTxt").click(MouseButton.LEFT, new Point(100, 15));

		desktop.<DomElement>find("nimbusserver.BrowserWindow.20").click();
		//desktop.<DomLink>find("nimbusserver.BrowserWindow.Bose Soundlink Bluet").click(MouseButton.LEFT,
		//		new Point(83, 11));

		DomElement _26999 = desktop.<DomElement>find("nimbusserver.BrowserWindow.$269 99");
		Assert.assertEquals("$269.99", _26999.getProperty("textContents"));

		desktop.<DomButton>find("nimbusserver.BrowserWindow.save_to_cart").click(MouseButton.LEFT, new Point(149, 20));
		desktop.<DomElement>find("nimbusserver.BrowserWindow.menuCart").click(MouseButton.LEFT, new Point(13, 9));
		DomElement _26999Span = desktop.<DomElement>find("nimbusserver.BrowserWindow.$269 99 Span");
		Assert.assertEquals("$269.99", _26999Span.getProperty("textContents"));

		desktop.<DomLink>find("nimbusserver.BrowserWindow.REMOVE").click(MouseButton.LEFT, new Point(21, 16));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.CONTINUE SHOPPING").click(MouseButton.LEFT,
				new Point(120, 17));
*/
		//start recording 
		desktop.<DomElement>find("nimbusserver.BrowserWindow.speakersImg").click(MouseButton.LEFT, new Point(249, 160));
		desktop.<DomElement>find("nimbusserver.BrowserWindow.20").click(MouseButton.LEFT, new Point(98, 74));
		DomElement _26999 = desktop.<DomElement>find("nimbusserver.BrowserWindow.$269 99");
		Assert.assertEquals("$269.99", _26999.getProperty("textContents"));
		desktop.<DomButton>find("nimbusserver.BrowserWindow.save_to_cart").click(MouseButton.LEFT, new Point(172, 27));
		desktop.<DomElement>find("nimbusserver.BrowserWindow.menuCart").click(MouseButton.LEFT, new Point(16, 10));
		DomElement _26999Span = desktop.<DomElement>find("nimbusserver.BrowserWindow.$269 99 Span");
		Assert.assertEquals("$269.99", _26999Span.getProperty("textContents"));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.REMOVE").click(MouseButton.LEFT, new Point(13, 13));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.CONTINUE SHOPPING").click(MouseButton.LEFT,
				new Point(120, 18));
		//end recording
	}

}