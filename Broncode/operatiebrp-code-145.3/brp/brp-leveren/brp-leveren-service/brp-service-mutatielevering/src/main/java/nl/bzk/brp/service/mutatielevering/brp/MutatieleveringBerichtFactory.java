/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.mutatielevering.brp;

import java.util.List;
import java.util.function.BiFunction;
import nl.bzk.brp.domain.berichtmodel.VerwerkPersoonBericht;
import nl.bzk.brp.service.mutatielevering.dto.Mutatiehandeling;
import nl.bzk.brp.service.mutatielevering.dto.Mutatielevering;

/**
 * Maakt een bericht voor de module Mutatielevering.
 */
interface MutatieleveringBerichtFactory extends BiFunction<List<Mutatielevering>, Mutatiehandeling, List<VerwerkPersoonBericht>> {
}
