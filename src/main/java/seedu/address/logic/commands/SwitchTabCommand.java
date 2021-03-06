package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class SwitchTabCommand extends Command {

    public static final String TASKS_COMMAND_WORD = "tasks";

    public static final String STATS_COMMAND_WORD = "stats";

    public static final int TASKS_TAB_INDEX = 0;

    public static final int STATS_TAB_INDEX = 1;

    public static final String MESSAGE_SUCCESS = "View changed.";

    private final int tabIndexToSwitch;

    public SwitchTabCommand(int tabIndexToSwitch) {
        this.tabIndexToSwitch = tabIndexToSwitch;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        return new SwitchTabCommandResult(MESSAGE_SUCCESS, tabIndexToSwitch);
    }
}
