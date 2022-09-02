package com.github.minthic.boredapp.controller.exception;

import java.util.List;

public class InvalidRequestErrorMessage
{
    private final String message = "Invalid request.";
    private final List<String> violations;

    public InvalidRequestErrorMessage(List<String> violations)
    {
        this.violations = violations;
    }

    public String getMessage()
    {
        return message;
    }

    public List<String> getViolations()
    {
        return violations;
    }
}
