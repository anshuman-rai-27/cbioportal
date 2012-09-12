// package
package org.mskcc.cbio.importer;

// imports
import org.mskcc.cbio.importer.model.DatatypeMetadata;
import org.mskcc.cbio.importer.model.TumorTypeMetadata;
import org.mskcc.cbio.importer.model.FirehoseDownloadMetadata;

import java.util.Collection;

/**
 * Interface used to get/set configuration properties.
 */
public interface Config {

	/**
	 * Gets a collection of TumorTypeMetadata.
	 *
	 * @return Collection<TumorTypeMetadata>
	 */
	Collection<TumorTypeMetadata> getTumorTypeMetadata();

	/**
	 * Gets a collection of DatatypeMetadata.
	 *
	 * @return Collection<DatatypeMetadata>
	 */
	Collection<DatatypeMetadata> getDatatypeMetadata();

	/**
	 * Gets FirehoseDownloadMetadata.
	 *
	 * @return FirehoseDownloadMetadata
	 */
	FirehoseDownloadMetadata getFirehoseDownloadMetadata();

	/**
	 * Sets FirehoseDownloadMetadata.  Really only used to store
     * stddata/analysis run dates.
	 *
     * @param firehoseDownloadMetadata FirehoseDownloadMetadata
	 * @return FirehoseDownloadMetadata
	 */
	void setFirehoseDownloadMetadata(final FirehoseDownloadMetadata firehoseDownloadMetadata);
}
