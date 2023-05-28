class Program5{
        public static void main(String[] args){
                StringBuffer sb=new StringBuffer();
                System.out.println(sb.capacity());
                System.out.println();

                sb.append("Bagal");
                System.out.println(sb.capacity());
                System.out.println(sb);

                sb.append("Core2Web");
                System.out.println(sb.capacity());
                System.out.println(sb);
        }
}
