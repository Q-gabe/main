package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.ReadOnlyUserPrefs;
import seedu.address.model.UserPrefs;
import seedu.address.model.appointment.Appointment;
import seedu.address.model.person.Person;

public class ShowCommandTest {
    @Test
    public void execute_correctShow_showSuccessful() {
        ShowCommandTest.ModelStubWithAppointmentTable modelStub = new ShowCommandTest
                .ModelStubWithAppointmentTable();

        CommandResult commandResult = new ShowCommand().execute(modelStub);

        assertEquals(String.format(ShowCommand.SHOWING_MOTD_MESSAGE), commandResult.getFeedbackToUser());
    }

    private class ModelStubWithAppointmentTable extends ModelStub {
        final UserPrefs userPrefs = new UserPrefs();

        @Override
        public ReadOnlyUserPrefs getUserPrefs() {
            return userPrefs;
        }

    }

    /**
     * A default model stub that have all of the methods failing.
     */
    private class ModelStub implements Model {
        @Override
        public void setUserPrefs(ReadOnlyUserPrefs userPrefs) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ReadOnlyUserPrefs getUserPrefs() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public GuiSettings getGuiSettings() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setGuiSettings(GuiSettings guiSettings) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public Path getAddressBookFilePath() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setAddressBookFilePath(Path addressBookFilePath) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void addPerson(Person person) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void addAppointment(int type, String description, int days) throws CommandException {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void deleteAppointment(String description, int days) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void sortAppointments() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public String outputAppointments() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void addAlias(String alias, String aliasTo) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public boolean removeAlias(String alias) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public String applyAlias(String commandText) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public String getAliases(boolean reusable) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setAddressBook(ReadOnlyAddressBook newData) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ReadOnlyAddressBook getAddressBook() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public boolean hasPerson(Person person) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void deletePerson(Person target) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void setPerson(Person target, Person editedPerson) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ObservableList<Person> getFilteredPersonList() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public ObservableList<Appointment> getFilteredAppointmentList() {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void updateFilteredPersonList(Predicate<Person> predicate) {
            throw new AssertionError("This method should not be called.");
        }

        @Override
        public void updateFilteredAppointmentList(Predicate<Appointment> predicate) {
            throw new AssertionError("This method should not be called.");
        }
    }
}
