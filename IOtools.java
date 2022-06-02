public class WritingCSVFileExample
{
    public static void main(String[] args) throws Exception
    {
        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        //Create record
        String [] record = "80".split(",");
        //Write the record to file
        writer.writeNext(record);
        //close the writer
        writer.close();
    }
}