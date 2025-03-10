package com.particle_life.app.cursors;

import com.particle_life.app.selection.InfoWrapper;
import com.particle_life.app.selection.InfoWrapperProvider;

import java.util.ArrayList;
import java.util.List;

public class CursorProvider implements InfoWrapperProvider<Cursor> {
    @Override
    public List<InfoWrapper<Cursor>> create() {
        List<InfoWrapper<Cursor>> list = new ArrayList<>();

        list.add(new InfoWrapper<>("Circle", "Cursor with round shape.", new CircleCursor()));
        list.add(new InfoWrapper<>("Square", "Cursor with square shape.", new SquareCursor()));
        list.add(new InfoWrapper<>("Infinity", "Cursor that always selects all particles.", new InfinityCursor()));
        list.add(new InfoWrapper<>("Velocity", "Only selects particles moving faster than a certain threshold.", new VelocityCursor()));

        return list;
    }
}
