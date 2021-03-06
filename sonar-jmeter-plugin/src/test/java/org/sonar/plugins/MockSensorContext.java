/*
 * Sonar JMeter Plugin
 * Copyright (C) 2010 eXcentia
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.NotImplementedException;
import org.sonar.api.batch.Event;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.design.Dependency;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.MeasuresFilter;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.ProjectLink;
import org.sonar.api.resources.Resource;
import org.sonar.api.rules.Violation;


@SuppressWarnings("rawtypes")
public class MockSensorContext implements SensorContext {

    @Override
    public Event createEvent(Resource arg0, String arg1, String arg2, String arg3, Date arg4) {
        throw new NotImplementedException();
    }

    @Override
    public void deleteEvent(Event arg0) {
        throw new NotImplementedException();
    }

    @Override
    public void deleteLink(String arg0) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Dependency> getDependencies() {
        throw new NotImplementedException();
    }

    @Override
    public List<Event> getEvents(Resource arg0) {
        throw new NotImplementedException();
    }

    @Override
    public Collection<Dependency> getIncomingDependencies(Resource arg0) {
        throw new NotImplementedException();
    }

    @Override
    public <M> M getMeasures(MeasuresFilter<M> arg0) {
        throw new NotImplementedException();
    }

    @Override
    public <M> M getMeasures(Resource arg0, MeasuresFilter<M> arg1) {
        throw new NotImplementedException();
    }

    @Override
    public Collection<Dependency> getOutgoingDependencies(Resource arg0) {
        throw new NotImplementedException();
    }

    @Override
    public Dependency saveDependency(Dependency arg0) {
        throw new NotImplementedException();
    }

    @Override
    public void saveLink(ProjectLink arg0) {
        throw new NotImplementedException();
    }

    @Override
    public Measure saveMeasure(Measure measure) {
    if (measure==null) {
        throw new NullPointerException();
    }
        if (measure.getMetric() == null) {
            throw new RuntimeException("Metric cannot be null");
        }

        return measure;
    }

    @Override
    public Measure saveMeasure(Metric metric, Double value) {
        if (value != null) {
            if (Double.isNaN(value)) {
                throw new RuntimeException("Double value cannot be NaN");
            }
        }
        return new Measure(metric, value);
    }

    @Override
    public Measure saveMeasure(Resource arg0, Measure arg1) {
        throw new NotImplementedException();
    }

    @Override
    public Measure saveMeasure(Resource arg0, Metric arg1, Double arg2) {
        throw new NotImplementedException();
    }

    @Override
    public String saveResource(Resource arg0) {
        throw new NotImplementedException();
    }

    @Override
    public void saveSource(Resource arg0, String arg1) {
        throw new NotImplementedException();
    }

    @Override
    public void saveViolation(Violation arg0) {
        throw new NotImplementedException();
    }

    @Override
    public void saveViolations(Collection<Violation> arg0) {
        throw new NotImplementedException();
    }

    @Override
    public boolean index(Resource resource) {
        throw new NotImplementedException();
    }

    @Override
    public boolean index(Resource resource, Resource parentReference) {
        throw new NotImplementedException();
    }

    @Override
    public boolean isExcluded(Resource reference) {
        throw new NotImplementedException();
    }

    @Override
    public boolean isIndexed(Resource reference, boolean acceptExcluded) {
        throw new NotImplementedException();
    }

    @Override
    public <R extends Resource> R getResource(R reference) {
        throw new NotImplementedException();
    }

    @Override
    public Resource getParent(Resource reference) {
        throw new NotImplementedException();
    }

    @Override
    public Collection<Resource> getChildren(Resource reference) {
        throw new NotImplementedException();
    }

    @Override
    public void saveViolation(Violation violation, boolean force) {
        throw new NotImplementedException();
    }

    @Override
    public <G extends Serializable> Measure<G> getMeasure(Metric<G> metric) {
        throw new NotImplementedException();
    }

    @Override
    public <G extends Serializable> Measure<G> getMeasure(Resource resource, Metric<G> metric) {
        throw new NotImplementedException();
    }

    @Override
    public Measure saveMeasure(InputFile inputFile, Metric metric, Double value) {
        throw new NotImplementedException();
    }

    @Override
    public Measure saveMeasure(InputFile inputFile, Measure measure) {
        throw new NotImplementedException();
    }

}
