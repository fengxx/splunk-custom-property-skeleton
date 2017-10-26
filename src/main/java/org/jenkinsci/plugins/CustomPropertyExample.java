package org.jenkinsci.plugins;

import com.splunk.splunkjenkins.model.LoggingJobExtractor;
import hudson.Extension;
import org.jenkinsci.plugins.workflow.job.WorkflowRun;

import java.util.HashMap;
import java.util.Map;

@Extension
public class CustomPropertyExample extends LoggingJobExtractor<WorkflowRun> {
    @Override
    public Map<String, Object> extract(WorkflowRun workflowRun, boolean jobCompleted) {
        Map<String, Object> event = new HashMap<>();
        event.put("displayName", workflowRun.getParent().getDisplayName());
        return event;
    }
}
