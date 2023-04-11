package Files.Managers;

import Files.Base.FileMeneger;
import Files.Exporter.CsvFileExporter;
import Files.Importers.CsvFileImporter;

public class CsvContactsFileMenager extends FileMeneger {

	public CsvContactsFileMenager(String fileName) {
		super(new CsvFileExporter(), new CsvFileImporter(), fileName);
	}


}
