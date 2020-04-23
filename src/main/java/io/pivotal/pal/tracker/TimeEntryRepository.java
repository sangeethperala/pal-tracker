package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntryToCreate);

    TimeEntry find(Long timeEntryId);

    List list();

    TimeEntry update(Long eq, TimeEntry any);

    void delete(Long timeEntryId);

}
