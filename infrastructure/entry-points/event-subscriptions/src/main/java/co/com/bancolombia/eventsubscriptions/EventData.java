package co.com.bancolombia.eventsubscriptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class EventData<T> {
    protected String specVersion;
    protected String type;
    protected String source;
    protected String id;
    protected T time;
    protected String invoker;
    protected String dataContentType;
    protected T data;
}
