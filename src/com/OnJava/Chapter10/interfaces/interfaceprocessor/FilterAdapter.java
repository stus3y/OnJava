package com.OnJava.Chapter10.interfaces.interfaceprocessor;

import com.OnJava.Chapter10.interfaces.filters.Filter;
import com.OnJava.Chapter10.interfaces.filters.Waveform;

public class FilterAdapter implements Processor{
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
