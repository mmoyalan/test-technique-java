package adeo.leroymerlin.cdp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EventControllerTest {

	@InjectMocks
	EventService eventService;

	@Mock
	EventRepository mockEventRepository;

	@Test
	public void testToFindAllEvents() {
		List<Event> eventsListedTest = new ArrayList<>();
		Mockito.when(mockEventRepository.findAllBy()).thenReturn(eventsListedTest);
		eventsListedTest = eventService.getEvents();
		Assert.assertNotNull("Return a list of events", eventsListedTest);
	}
}
