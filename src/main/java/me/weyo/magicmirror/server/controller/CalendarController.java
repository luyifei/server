package me.weyo.magicmirror.server.controller;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WeYo
 */
public class CalendarController extends BaseController {

    /** Serial ID */
    private static final long serialVersionUID = 6683891537044452693L;
    private static final Logger LOG = LoggerFactory.getLogger(CalendarController.class);

    public void init() throws ServletException {
        this.contentType = "text/calendar";
    }

    @Override
    public void doLog(String msg, Object object) {
        LOG.debug("Calendar handled: " + msg);
    }
}
