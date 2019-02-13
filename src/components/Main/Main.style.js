const drawerWidth = 240;
const headerHeight = 70;

const styles = theme => ({
  content: {
    padding: theme.spacing.unit * 3,
    overflow: "auto",
    height: "calc(100vh - "+headerHeight+"px)"
  },
  mainArea: {
    marginLeft: 0,
    display: "flex",
    height: "100%",
    flexDirection: "column",
    transition: theme.transitions.create('margin', {
      easing: theme.transitions.easing.sharp,
      duration: theme.transitions.duration.leavingScreen,
    })
  },
  mainAreaShift: {
    transition: theme.transitions.create('margin', {
      easing: theme.transitions.easing.easeOut,
      duration: theme.transitions.duration.enteringScreen,
    }),
    marginLeft: drawerWidth,
  }
})

export default styles;