package com.vaadin.tests.components.table;

import org.junit.Test;

import com.vaadin.testbench.elements.TableElement;
import com.vaadin.tests.tb3.MultiBrowserTest;

import static org.junit.Assert.assertTrue;

public class SelectableEditableTest extends MultiBrowserTest {
    @Test
    public void testSelectFromCellWith() throws Exception {
        openTestURL();
        TableElement table = $(TableElement.class).first();
        table.getCell(0, 1).click();
        assertTrue("Element does not have the 'v-selected' css class",
                hasCssClass(table.getRow(0), "v-selected"));
    }
}
